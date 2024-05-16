#include <iostream>
using namespace std;

int main() {
    int n, x, sum = 0;
    cout << "Enter how many numbers to enter: ";
    cin >> n;
    cout << "Enter " << n << " numbers: ";
    for (int i=0; i<n; i++) {
        cin >> x;
        int a = x%10;
        x = ((x/100)*10)+a;
        sum += x;
    }
    cout << sum;
    return 0;
}