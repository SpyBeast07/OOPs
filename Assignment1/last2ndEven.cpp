#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter number: ";
    cin >> n;
    while ((n%10)%2==1)
    {
        n /= 10;
        continue;
    }
    n /= 10;
    while(n>0)
    {
        if ((n%10)%2==0)
        {
            cout << n%10 << endl;
            break;
        }
        n /= 10;
    }
    return 0;
}