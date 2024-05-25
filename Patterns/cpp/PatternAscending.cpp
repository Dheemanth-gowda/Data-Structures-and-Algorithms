#include <iostream>

void printPatterns(int size)
{
    for (int i = 0; i < size; i++)
    {
        for (int j = 0; j <= i; j++)
        {
            std::cout << "*";
        }
        std::cout << std::endl;
    }
}

int main()
{
    int invalideSize = -1;
    int patternSize = -1;

    do
    {
        std::cout << "Input pattern size : ";
        std::cin >> patternSize;
    } while (patternSize <= invalideSize);

    if (patternSize)
    {
        printPatterns(patternSize);
    }
    else
    {
        std::cout << "Exiting";
    }

    return 0;
}