#include <iostream>
using namespace std;

int main() {
    int n, sum = 0;
    cout << "Enter number: ";
    cin >> n;
    while (n > 9) {
        int b = n % 10;
        n /= 10;
        int a = n % 10;
        sum += ((b * 10) + a);
    }
    cout << sum << endl;
    return 0;
}