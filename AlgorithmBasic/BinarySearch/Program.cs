using System;

class Program
{
    static int BinarySearch(int[] arr, int target)
    {
        int left = 0, right = arr.Length - 1;

        while (left <= right) // Lặp khi còn phần tử để tìm
        {
            int mid = left + (right - left) / 2; // Tìm phần tử giữa

            if (arr[mid] == target) // Nếu phần tử giữa là target
                return mid;

            if (arr[mid] < target) // Nếu target lớn hơn, tìm nửa phải
                left = mid + 1;
            else // Nếu target nhỏ hơn, tìm nửa trái
                right = mid - 1;
        }

        return -1; // Không tìm thấy
    }

    static void Main()
    {
        int[] numbers = { 10, 20, 30, 40, 50 }; // Mảng phải được sắp xếp
        int target = 30;

        int result = BinarySearch(numbers, target);

        if (result != -1)
            Console.WriteLine($"Tìm thấy {target} tại vị trí {result}");
        else
            Console.WriteLine($"{target} không có trong mảng");
    }
}
