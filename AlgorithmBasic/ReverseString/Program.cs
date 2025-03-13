using System;

class ReverseString
{
    public static string Reverse(string str)
    {
        string reversed = ""; // Chuỗi kết quả

        // Duyệt chuỗi từ ký tự cuối đến đầu
        for (int i = str.Length - 1; i >= 0; i--)
        {
            reversed += str[i]; // Nối ký tự vào chuỗi reversed
        }

        return reversed; // Trả về chuỗi đã đảo ngược
    }

    static void Main()
    {
        Console.WriteLine(Reverse("automation")); // Output: "noitamotua"
    }
}
