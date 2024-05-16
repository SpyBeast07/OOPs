#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter number till when to print multiples of 3: ";
    cin >> n;
    for (int i = 0; i <= n; i++) {
        if ((i % 10) % 3 == 0) {
            cout << i << " ";
        }
    }
    return 0;
}