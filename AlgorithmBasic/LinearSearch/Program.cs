using System;

class Program
{
    static void Main()
    {
        int[] numbers = { 10, 20, 30, 40, 50 };
        int target = 30;

        int result = LinearSearch(numbers, target);

        if (result != -1)
            Console.WriteLine($"Found {target} at index {result}");
        else
            Console.WriteLine($"{target} not found");
    }

    static int LinearSearch(int[] arr, int target)
    {
        for (int i = 0; i < arr.Length; i++)
        {
            if (arr[i] == target) // Nếu tìm thấy phần tử
                return i; // Trả về vị trí của phần tử
        }
        return -1; // Không tìm thấy
    }

   
}
