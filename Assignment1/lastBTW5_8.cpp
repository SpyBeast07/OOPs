#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter number till which to print: ";
    cin >> n;
    for (int i = 5; i <= n; i++) {
        int x = (i % 10);
        if (x >= 5 && x <= 8) {
            cout << i << " ";
        }
    }
    return 0;
}