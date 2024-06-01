#include <iostream>

void printSquarePattern(int patternSize)
{
    for (int i = 0; i < patternSize; i++)
    {
        for (int j = 0; j <= i; j++)
        {
            std::cout << j+1;
        }
        std::cout << std::endl;
    }
}

int main()
{
    const int INVALID_INPUT = 0;
    int patternSize = -1;

    do
    {
        std::cout << "Enter the pattern size (positive integer): ";
        std::cin >> patternSize;
    } while (patternSize <= INVALID_INPUT);

    std::cout << std::endl;
    printSquarePattern(patternSize);
    std::cout << std::endl;

    return 0;
}