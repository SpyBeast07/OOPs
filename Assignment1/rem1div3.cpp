#include <iostream>
using namespace std;

int main() {
    for (int i = 10; i <= 79; i++) {
        if ((i / 10) % 3 == 1) {
            cout << i << " ";
        }
    }
    return 0;
}