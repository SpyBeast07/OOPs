#include <iostream>
using namespace std;

int main() {
    for (int i = 20; i <= 40; i++) {
        if (i % 2 == 0) {
            cout << i << " ";
        }
    }
    cout << endl;
    for (int j = 50; j < 80; j++) {
        if (j % 2 == 1) {
            cout << j << " ";
        }
    }
    return 0;
}