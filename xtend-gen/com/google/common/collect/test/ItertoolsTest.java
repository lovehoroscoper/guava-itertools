package com.google.common.collect.test;

import com.google.common.collect.Itertools;
import com.google.common.collect.Itertools2;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class ItertoolsTest {
  public static void main(final String[] args) {
    final ArrayList<String> abc = CollectionLiterals.<String>newArrayList("a", "b", "c");
    ArrayList<List<String>> _newArrayList = CollectionLiterals.<List<String>>newArrayList(abc, abc);
    List<List<String>> _product = Itertools.<String>product(_newArrayList, 1);
    String _plus = ("product of [[\'a\', \'b\', \'c\'], [\'a\', \'b\', \'c\']]:\n" + _product);
    InputOutput.<String>println(_plus);
    ArrayList<List<String>> _newArrayList_1 = CollectionLiterals.<List<String>>newArrayList(abc, abc);
    List<List<String>> _product_1 = Itertools.<String>product(_newArrayList_1, 2);
    String _plus_1 = ("2-repeated product of [[\'a\', \'b\', \'c\'], [\'a\', \'b\', \'c\']]:\n" + _product_1);
    InputOutput.<String>println(_plus_1);
    InputOutput.println();
    List<List<String>> _permutations = Itertools.<String>permutations(abc, 1);
    String _plus_2 = ("1-permutations of [\'a\', \'b\', \'c\']:\n" + _permutations);
    InputOutput.<String>println(_plus_2);
    List<List<String>> _permutations_1 = Itertools.<String>permutations(abc, 2);
    String _plus_3 = ("2-permutations of [\'a\', \'b\', \'c\']:\n" + _permutations_1);
    InputOutput.<String>println(_plus_3);
    List<List<String>> _permutations_2 = Itertools.<String>permutations(abc, 3);
    String _plus_4 = ("3-permutations of [\'a\', \'b\', \'c\']:\n" + _permutations_2);
    InputOutput.<String>println(_plus_4);
    List<List<String>> _permutations_3 = Itertools.<String>permutations(abc, 4);
    String _plus_5 = ("4-permutations of [\'a\', \'b\', \'c\']:\n" + _permutations_3);
    InputOutput.<String>println(_plus_5);
    InputOutput.println();
    List<List<String>> _combinations = Itertools.<String>combinations(abc, 1);
    String _plus_6 = ("1-combinations of [\'a\', \'b\', \'c\']:\n" + _combinations);
    InputOutput.<String>println(_plus_6);
    List<List<String>> _combinations_1 = Itertools.<String>combinations(abc, 2);
    String _plus_7 = ("2-combinations of [\'a\', \'b\', \'c\']:\n" + _combinations_1);
    InputOutput.<String>println(_plus_7);
    List<List<String>> _combinations_2 = Itertools.<String>combinations(abc, 3);
    String _plus_8 = ("3-combinations of [\'a\', \'b\', \'c\']:\n" + _combinations_2);
    InputOutput.<String>println(_plus_8);
    List<List<String>> _combinations_3 = Itertools.<String>combinations(abc, 4);
    String _plus_9 = ("4-combinations of [\'a\', \'b\', \'c\']:\n" + _combinations_3);
    InputOutput.<String>println(_plus_9);
    InputOutput.println();
    InputOutput.println();
    ArrayList<ArrayList<String>> _newArrayList_2 = CollectionLiterals.<ArrayList<String>>newArrayList(abc, abc);
    List<List<List<String>>> _permutationsProduct = Itertools2.<String>permutationsProduct(_newArrayList_2);
    String _plus_10 = ("permutationsProduct of [[\'a\', \'b\', \'c\'], [\'a\', \'b\', \'c\']]:\n" + _permutationsProduct);
    InputOutput.<String>println(_plus_10);
    InputOutput.println();
    final ArrayList<String> de = CollectionLiterals.<String>newArrayList("d", "e");
    ArrayList<ArrayList<String>> _newArrayList_3 = CollectionLiterals.<ArrayList<String>>newArrayList(abc, abc);
    ArrayList<ArrayList<String>> _newArrayList_4 = CollectionLiterals.<ArrayList<String>>newArrayList(de);
    List<List<? extends String>> _linkedPermutations = Itertools2.<String>linkedPermutations(_newArrayList_3, _newArrayList_4);
    String _plus_11 = ("linkedPermutations of [[\'a\', \'b\', \'c\'], [\'d\', \'e\']]:\n" + _linkedPermutations);
    InputOutput.<String>println(_plus_11);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("product of [");
    _builder.append(abc, "");
    _builder.append(", ");
    _builder.append(abc, "");
    _builder.append("]:");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    ArrayList<List<String>> _newArrayList_5 = CollectionLiterals.<List<String>>newArrayList(abc, abc);
    List<List<String>> _product_2 = Itertools.<String>product(_newArrayList_5);
    _builder.append(_product_2, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("0-repeated product of [");
    _builder.append(abc, "");
    _builder.append(", ");
    _builder.append(abc, "");
    _builder.append("]:");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    ArrayList<List<String>> _newArrayList_6 = CollectionLiterals.<List<String>>newArrayList(abc, abc);
    List<List<String>> _product_3 = Itertools.<String>product(_newArrayList_6, 1);
    _builder.append(_product_3, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("1-repeated product of [");
    _builder.append(abc, "");
    _builder.append(", ");
    _builder.append(abc, "");
    _builder.append("]:");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    ArrayList<List<String>> _newArrayList_7 = CollectionLiterals.<List<String>>newArrayList(abc, abc);
    List<List<String>> _product_4 = Itertools.<String>product(_newArrayList_7, 1);
    _builder.append(_product_4, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("2-repeated product of [");
    _builder.append(abc, "");
    _builder.append(", ");
    _builder.append(abc, "");
    _builder.append("]:");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    ArrayList<List<String>> _newArrayList_8 = CollectionLiterals.<List<String>>newArrayList(abc, abc);
    List<List<String>> _product_5 = Itertools.<String>product(_newArrayList_8, 2);
    _builder.append(_product_5, "	");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("permutations of ");
    _builder.append(abc, "");
    _builder.append(":");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    List<List<String>> _permutations_4 = Itertools.<String>permutations(abc);
    _builder.append(_permutations_4, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("0-permutations of ");
    _builder.append(abc, "");
    _builder.append(":");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    List<List<String>> _permutations_5 = Itertools.<String>permutations(abc, 0);
    _builder.append(_permutations_5, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("1-permutations of ");
    _builder.append(abc, "");
    _builder.append(":");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    List<List<String>> _permutations_6 = Itertools.<String>permutations(abc, 1);
    _builder.append(_permutations_6, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("2-permutations of ");
    _builder.append(abc, "");
    _builder.append(":");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    List<List<String>> _permutations_7 = Itertools.<String>permutations(abc, 2);
    _builder.append(_permutations_7, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("3-permutations of ");
    _builder.append(abc, "");
    _builder.append(":");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    List<List<String>> _permutations_8 = Itertools.<String>permutations(abc, 3);
    _builder.append(_permutations_8, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("4-permutations of ");
    _builder.append(abc, "");
    _builder.append(":");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    List<List<String>> _permutations_9 = Itertools.<String>permutations(abc, 4);
    _builder.append(_permutations_9, "	");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("combinations of ");
    _builder.append(abc, "");
    _builder.append(":");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    List<List<String>> _combinations_4 = Itertools.<String>combinations(abc);
    _builder.append(_combinations_4, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("0-combinations of ");
    _builder.append(abc, "");
    _builder.append(":");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    List<List<String>> _combinations_5 = Itertools.<String>combinations(abc, 0);
    _builder.append(_combinations_5, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("1-combinations of ");
    _builder.append(abc, "");
    _builder.append(":");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    List<List<String>> _combinations_6 = Itertools.<String>combinations(abc, 1);
    _builder.append(_combinations_6, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("2-combinations of ");
    _builder.append(abc, "");
    _builder.append(":");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    List<List<String>> _combinations_7 = Itertools.<String>combinations(abc, 2);
    _builder.append(_combinations_7, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("3-combinations of ");
    _builder.append(abc, "");
    _builder.append(":");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    List<List<String>> _combinations_8 = Itertools.<String>combinations(abc, 3);
    _builder.append(_combinations_8, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("4-combinations of ");
    _builder.append(abc, "");
    _builder.append(":");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    List<List<String>> _combinations_9 = Itertools.<String>combinations(abc, 4);
    _builder.append(_combinations_9, "	");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.newLine();
    _builder.append("permutationsProduct of [");
    _builder.append(abc, "");
    _builder.append(", ");
    _builder.append(abc, "");
    _builder.append("]:\\n\" + permutationsProduct(newArrayList(abc, abc)))");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("linkedPermutations of [");
    _builder.append(abc, "");
    _builder.append(", ");
    _builder.append(de, "");
    _builder.append("]:");
    _builder.newLineIfNotEmpty();
    ArrayList<ArrayList<String>> _newArrayList_9 = CollectionLiterals.<ArrayList<String>>newArrayList(abc, abc);
    ArrayList<ArrayList<String>> _newArrayList_10 = CollectionLiterals.<ArrayList<String>>newArrayList(de);
    List<List<? extends String>> _linkedPermutations_1 = Itertools2.<String>linkedPermutations(_newArrayList_9, _newArrayList_10);
    _builder.append(_linkedPermutations_1, "");
    _builder.newLineIfNotEmpty();
    _builder.append("//TODO should be linked combinations, no?");
    _builder.newLine();
    _builder.newLine();
    InputOutput.<CharSequence>println(_builder);
  }
}
