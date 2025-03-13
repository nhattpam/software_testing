// Online C# Editor for free
// Write, Edit and Run your C# code using C# Online Compiler

using System;

public class Program
{
    public static void Main(string[] args)
    {
        int[] array = { 2, 5, 6, 1, 7 };
        SelectionSort(array);
        foreach (var item in array)
            Console.Write(item + ", ");
    }

    static void SelectionSort(int[] array)
    {
        int n = array.Length;
        for (int i = 0; i < n - 1; i++)
        {
            int minIndex = i;

            // Tìm phần tử nhỏ nhất trong đoạn [i, n-1]
            for (int j = i + 1; j < n; j++)
            {
                if (array[j] < array[minIndex])
                {
                    minIndex = j;
                }
            }

            // Hoán đổi phần tử nhỏ nhất với phần tử đầu của đoạn chưa sắp xếp
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

}