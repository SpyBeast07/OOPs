#include <iostream>
using namespace std;

int main() {
    int x, y;
    cout << "Enter 2 numbers: ";
    cin >> x >> y;
    int a = x % 10;
    int b = y % 10;
    x = ((x - a) + b);
    y = ((y - b) + a);
    cout << (x * y) << endl;
    return 0;
}