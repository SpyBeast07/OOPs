#include <iostream>
using namespace std;

int main() {
    int n, sum = 0;
    cout << "Enter number: ";
    cin >> n;
    while (n > 9) {
        int x = n % 100;
        sum += x;
        n /= 10;
    }
    cout << sum << endl;
    return 0;
}