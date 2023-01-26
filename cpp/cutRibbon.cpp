#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n,a,b,c;
    cin>>n>>a>>b>>c;

    if(a+b <= n)
        cout<<2;
    else if(a+c <= n)
        cout<<2;
    else if (b+c <= n)
        cout<<2;
    else 
        cout<<1;    

return 0;
}