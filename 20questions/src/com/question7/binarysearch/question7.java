package com.question7.binarysearch;

public class question7 {
	private static int[] list = new int []{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
	public static void main(String[] args)
	{
		binarysearch(list, 877);
		
	}
		private static int binarysearch(final int[] array, final int search)
		{
			int first = 0;
			int last = array.length-1;
			int middle = (first + last)/2;
			while (first <= last) 
			{
				if(array[middle]< search)
				{
					first = middle + 1;
				}
				else if (array[middle] == search) 
				{
					System.out.println(middle+" middle Line");
					return middle;
				}
				else
				{
					last = middle =1;
				}
				middle = (first + last) / 2;
			}
			System.out.println(middle+" last line");
			return -1;
		}
		}




