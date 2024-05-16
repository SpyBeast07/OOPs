#include <iostream>
using namespace std;

int main() {
    int n, sum=0, j=1;
    cout << "Enter how many numbers to enter: ";
    cin >> n;
    cout << "Enter " << n << " numbers: ";
    for (int i=0; i<n; i++) {
        int x;
        cin >> x;
        if (x%2==0) {
            sum += (j*x);
            j++;
        }
    }
    cout << sum << endl;
    return 0;
}