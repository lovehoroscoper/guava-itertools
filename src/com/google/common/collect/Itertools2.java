package com.google.common.collect;

import static com.google.common.collect.Itertools.*;
import java.util.Collection;
import java.util.List;

public class Itertools2 {
	
	public static <T> List<List<List<T>>> permutationsProduct(Iterable<? extends Iterable<? extends T>> iterables) {
		/*
		def permutations_product(*iterables):
		    permprod = list()
		    for perm in product(*iterables):
		        permprod.append(permutations(perm))
		    return permprod
		 */
		List<List<List<T>>> permprod = Lists.newArrayList();
		for (Collection<T> perm : product(iterables, 1))
			permprod.add(permutations(perm));
		return permprod;
	}
	
	public static <T> List<List<? extends T>> linkedPermutations(Collection<? extends Iterable<? extends T>> expressions, List<? extends Iterable<? extends T>> links) {
		/*
		def permutations_sets(expressions, linkers=None):
		    # handle linkers being null
		    if linkers is None:
		        linkers = ''
		    # handle linkers not being a sequence
		    if isinstance(linkers, basestring):
		        iterable = False
		    else:
		        try:
		            (l for l in linkers)
		            iterable = True
		        except TypeError:
		            iterable = False
		    if not iterable:
		        linkers = [str(linkers)]
		*/
		/*
		    # adjust linkers to fit between expressions
		    linkers = list(linkers) # make linkers mutable in case it was a tuple
		    l = len(expressions) - 1
		    if len(linkers) < l:
		        linkers.extend([linkers[-1] for i in range(l - len(linkers))])
		    elif len(linkers) > l:
		        linkers = linkers[:l]
		    assert len(linkers) == l
		    assert len(linkers) == len(expressions) - 1 # always one fewer linkers than expressions
		 */
		int expressionsSize = expressions.size();
		int linksSize = links.size();
		List<Iterable<? extends T>> linkers = Lists.newArrayList(links);
		if (linkers.size() > 0) {
			int l = expressionsSize - 1;
			if (linkers.size() < l) {
				for (int i = 0; i < l - linkers.size(); i++)
					linkers.add(links.get(linksSize - 1));
			}
			else if (linkers.size() > l)
				linkers = linkers.subList(0, l);
			if (linkers.size() != l)
				throw new RuntimeException("linkers.size() != l");
			if (linkers.size() != expressionsSize - 1)
				throw new RuntimeException("linkers.size() != expressions.size() - 1");
		}
		/*
		# linkers as lists 
		    sequences = []
		    for perms_prod in permutations_product(*expressions):
		        for perm in perms_prod: # for each permutation of the product of expressions
		            for ls in product(*linkers):
		                sequence = []
		                for i, l in enumerate(ls): # for each linkers product
		                    sequence += [perm[i]] + [l] # concatenate perm with linker
		                sequence += [perm[-1]] # # add last perm
		                sequences.append(sequence)
		    return sequences
		*/
		List<List<? extends T>> sequences = Lists.newArrayList();
		for (List<List<T>> perms_prod : permutationsProduct(expressions)) {
			if (linkers.size() > 0)	{
				for (List<? extends T> perm : perms_prod) {
					for (List<T> ls : product(linkers, 1)) {
						List<T> sequence = Lists.newArrayList();
						for (int i = 0; i < ls.size(); i++) {
							sequence.add(perm.get(i));
							sequence.add(ls.get(i));
						}
						sequence.add(perm.get(perm.size() - 1));
						sequences.add(sequence);
					}
				}
			}
			else
				sequences.addAll(perms_prod);
		}
		return sequences;
	}

}
