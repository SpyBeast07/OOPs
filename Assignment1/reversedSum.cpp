#include <iostream>
using namespace std;

int main() {
    int n, sum = 0;
    cout << "Enter how many numbers to enter: ";
    cin >> n;
    cout << "Enter " << n << " numbers: ";
    for (int i = 0; i < n; i++) {
        int x, m = 0;
        cin >> x;
        while (x > 0) {
            m = (m * 10) + (x % 10);
            x /= 10;
        }
        sum += m;
    }
    cout << sum << endl;
    return 0;
}