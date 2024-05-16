#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter number: ";
    cin >> n;
    int x = (n % 1000);
    n = (n / 1000);
    int a = (x / 100);
    int b = ((x % 100) / 10);
    int c = (x % 10);
    x = ((c * 100) + (b * 10) + a);
    n = ((n * 1000) + x);
    cout << n << endl;
    return 0;
}