#include <iostream>
using namespace std;

int main(){
    for (int i=0; i<=99; i++){
        int a = i/10;
        int b = i%10;
        if ((a+b)%7==0){
            cout << i << " ";
        }
    }
    return 0;
}