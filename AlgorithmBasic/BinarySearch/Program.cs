using System;

class Program
{
    static void Main(string[] args)
    {
        int[] array = { 5, 6, 7, 8, 2, 1 };
        Array.Sort(array); // Sắp xếp mảng trước khi tìm kiếm
        int target = 8;
        int result = BinarySearch(array, target);
        if (result != -1)
        {
            Console.Write($"Found {target} at index {result}");
        }
        else
        {
            Console.Write($"Cannot found {target}");
        }
    }

    static int BinarySearch(int[] array, int target)
    {
        int left = 0; int right = array.Length - 1;
        while (left <= right)
        {
            int mid = left + (right - left) / 2;

            if (array[mid] == target)
                return mid;
            if (array[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }
}
