#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter number: ";
    cin >> n;
    int m = n;
    int maxd = 0;
    while (m > 0) {
        int a = m % 10;
        if (a > maxd) {
            maxd = a;
        }
        m /= 10;
    }

    int p = 1;
    m = 0;
    while (n > 0) {
        int digi = n % 10;
        if (digi != maxd) {
            m += digi * p;
            p *= 10;
        }
        n /= 10;
    }
    cout << m;
    return 0;
}