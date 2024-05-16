#include <iostream>
using namespace std;

int main() {
    int n, sum = 0, a = 0;
    cout << "Enter how many numbers to enter: ";
    cin >> n;
    cout << "Enter " << n << " numbers: ";
    for (int i = 0; i < n; i++) {
        int x;
        cin >> x;
        sum += (a * x);
        a = x;
    }
    cout << sum << endl;
    return 0;
}