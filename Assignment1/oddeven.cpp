#include <iostream>
using namespace std;

int main() {
    for (int i = 0; i < 90; i++) {
        if (((i / 10) % 2) == 0 && (i % 2) == 1) {
            cout << i << " ";
        }
    }
    cout << endl;
    for (int j = 1; j < 100; j++) {
        if (((j / 10) % 2) == 1 && (j % 2) == 0) {
            cout << j << " ";
        }
    }
    return 0;
}