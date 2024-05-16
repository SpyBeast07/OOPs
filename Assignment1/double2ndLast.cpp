#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter number: ";
    cin >> n;
    int l = n % 10;
    int x = ((n % 100) / 10);
    n = ((((n / 10) + x) * 10) + l);
    cout << n << endl;
    return 0;
}