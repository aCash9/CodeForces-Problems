#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n ,a,b,c;
    int sx=0,sy=0,sz=0;
    cin >> n;
    while(n--)
    {
        
        cin>>a>>b>>c;
        sx+=a;
        sy+=b;
        sz+=c;
    }
    if(sx==0&&sy==0&&sz==0)
        cout<<"YES";
    else 
        cout<<"NO";
    return 0;
}