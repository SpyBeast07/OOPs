#include <iostream>
using namespace std;

int main() {
    int a, b, c, p;
    cout << "Enter 4 numbers: ";
    cin >> a >> b >> c >> p;
    int x = a*p*p + b*p - c;
    cout << x << endl;
    return 0;
}