#include <iostream>
using namespace std;

int main() {
    int n, sum = 0, x = 3;
    cout << "Enter how many numbers to enter: ";
    cin >> n;
    cout << "Enter " << n << " numbers: ";
    while (x % 2 == 1) {
        cin >> x;
        n--;
    }
    sum += x;
    while (n > 0) {
        cin >> x;
        sum += x;
        n--;
    }
    cout << sum << endl;
    return 0;
}