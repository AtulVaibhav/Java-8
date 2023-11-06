package com.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test3 {

	public static void main(String[] args) {
		//creating a stream of objects
		//1.Stream.of()
		Stream<Integer> streamOfObject = Stream.of(1,2,3,4,5,6);
		
		//2.Stream.of(array)
		String[] arr = {"Mobiles","Laptops","Televisions","ElectronicGoods"};
		Stream<String> streamOfString = Stream.of(arr);
		
		//3.List.stream()
		List<Integer> list = Arrays.asList(11,12,13,14,15);
		Stream<Integer> stream = list.stream();
		
		//Intermediate Operation
		// filter():
		streamOfObject.filter(x-> x%2==0)
		.forEach(x->System.out.print(x+" "));
		
		System.out.println();
		
		//map()
		List<Integer> list2 = Arrays.asList(1,2,3,4,5,6,7,8);
		list2.stream()
		.map(x -> x*x).forEach(System.out::println);
		
		
		//filter & map
		list2.stream()
		.filter(x->x%2==1)
		.map(x->x*x)
		.forEach(x->System.out.print(x+" "));
		System.out.println();
		
		
		//sort
		streamOfString.sorted().forEach(x->System.out.print(x+" "));
		System.out.println();
		
		String[] names = {"Vivek","Amit","Ashwani","John","Vishal","Aayush"};
		Stream.of(names).filter(x->x.startsWith("A"))
		.sorted().forEach(x->System.out.print(x+" "));
		
		
		//Terminal
		//1.forEach
		//2.collect
		
		List<Integer> listOfNumbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		List<Integer> data = listOfNumbers.stream()
		                     .map(x->x+2)
		                     .collect(Collectors.toList());
		
		System.out.println(data);
		
		
		// count()
		List<Integer> data2 = Arrays.asList(1,2,1,3,2,4,1,5,3,1,6,7,1,1,8);
		long count = data2.stream()
		.filter(x->x==1)
		.count();
		System.out.println(count);
		
		//distinct()
		List<Integer> uniqueElements = data2.stream()
		.distinct()
		.collect(Collectors.toList());
		System.out.println(uniqueElements);
		
		
		//reduce()
        List<Integer> listOfValues = Arrays.asList(1,2,3,4,5);
        Optional<Integer> total = listOfValues.stream()
                                  .reduce((a,b)->a+b);
        
        total.ifPresent(System.out::println);
		
		Optional<String> reduceData = Stream.of(names).reduce((s1,s2)-> s1+"$"+s2);
		reduceData.ifPresent(System.out::println);
		
		
		
		
		
		
		
		
	}

}
