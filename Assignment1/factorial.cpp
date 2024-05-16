#include <iostream>
using namespace std;

int main() {
    int n, fact = 1;
    cout << "Enter number: ";
    cin >> n;
    while (n > 0) {
        fact *= n;
        n--;
    }
    while (fact > 9) {
        fact /= 10;
    }
    cout << fact << endl;
    return 0;
}