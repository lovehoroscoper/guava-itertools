package com.google.common.collect.test

import static com.google.common.collect.Itertools.*
import static com.google.common.collect.Itertools2.*
import java.util.List

class ItertoolsTest {
	
	def static void main(String[] args) {

		val abc = newArrayList('a', 'b', 'c')
		
		println("product of [['a', 'b', 'c'], ['a', 'b', 'c']]:\n" + product(<List<String>>newArrayList(abc, abc), 1))
		println("2-repeated product of [['a', 'b', 'c'], ['a', 'b', 'c']]:\n" + product(<List<String>>newArrayList(abc, abc), 2))
		println
		println("1-permutations of ['a', 'b', 'c']:\n" + permutations(abc, 1))
		println("2-permutations of ['a', 'b', 'c']:\n" + permutations(abc, 2))
		println("3-permutations of ['a', 'b', 'c']:\n" + permutations(abc, 3))
//		println("1-permutations of ['a', 'b', 'c']:\n" + permutations(abc))
		println("4-permutations of ['a', 'b', 'c']:\n" + permutations(abc, 4))
		println
		println("1-combinations of ['a', 'b', 'c']:\n" + combinations(abc, 1))
		println("2-combinations of ['a', 'b', 'c']:\n" + combinations(abc, 2))
		println("3-combinations of ['a', 'b', 'c']:\n" + combinations(abc, 3)); 
//		println(combinations(abc))	
		println("4-combinations of ['a', 'b', 'c']:\n" + combinations(abc, 4)); 
		println
		println
		println("permutationsProduct of [['a', 'b', 'c'], ['a', 'b', 'c']]:\n" + permutationsProduct(newArrayList(abc, abc)))
//		println(permutationsProduct(abc, abc))
		println
		val de = newArrayList('d', 'e')
		println("linkedPermutations of [['a', 'b', 'c'], ['d', 'e']]:\n" + linkedPermutations(newArrayList(abc, abc), newArrayList(de))); //TODO should be linked combinations, no?

		println('''
		product of [«abc», «abc»]:
			«product(<List<String>>newArrayList(abc, abc))»
		0-repeated product of [«abc», «abc»]:
			«product(<List<String>>newArrayList(abc, abc), 1)»
		1-repeated product of [«abc», «abc»]:
			«product(<List<String>>newArrayList(abc, abc), 1)»
		2-repeated product of [«abc», «abc»]:
			«product(<List<String>>newArrayList(abc, abc), 2)»
		
		permutations of «abc»:
			«permutations(abc)»
		0-permutations of «abc»:
			«permutations(abc, 0)»
		1-permutations of «abc»:
			«permutations(abc, 1)»
		2-permutations of «abc»:
			«permutations(abc, 2)»
		3-permutations of «abc»:
			«permutations(abc, 3)»
		4-permutations of «abc»:
			«permutations(abc, 4)»
		
		combinations of «abc»:
			«combinations(abc)»
		0-combinations of «abc»:
			«combinations(abc, 0)»
		1-combinations of «abc»:
			«combinations(abc, 1)»
		2-combinations of «abc»:
			«combinations(abc, 2)»
		3-combinations of «abc»:
			«combinations(abc, 3)»
		4-combinations of «abc»:
			«combinations(abc, 4)»
		
		
		permutationsProduct of [«abc», «abc»]:\n" + permutationsProduct(newArrayList(abc, abc)))
«««		(permutationsProduct(abc, abc))
		
		linkedPermutations of [«abc», «de»]:
		«linkedPermutations(newArrayList(abc, abc), newArrayList(de))»
		//TODO should be linked combinations, no?
		
		''')

	}
	
}