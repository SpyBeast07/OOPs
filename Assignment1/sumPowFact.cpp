#include <iostream>
using namespace std;

int main() {
    int n, m, sum=0;
    cout << "Enter number: ";
    cin >> n;
    m = n;
    while (m > 0) {
        sum += (m % 10);
        m /= 10;
    }
    int smallest_factor = 0;
    for (int j=2; j<((n/2)+1); j++) {
        if (n%j==0) {
            smallest_factor = j;
            break;
        }
    }
    cout << "Sum of digits: " << sum << "\nSmallest factor: " << smallest_factor << endl;
    return 0;
}