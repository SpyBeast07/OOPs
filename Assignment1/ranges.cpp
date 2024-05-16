#include <iostream>
using namespace std;

int main() {
    for (int i = 10; i < 100; i++) {
        if (((i/10)%2) == 1) {
            cout << i << " ";
        }
    }
    return 0;
}