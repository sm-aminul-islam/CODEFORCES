#include<bits/stdc++.h>
using namespace std;
#define int long long int
int32_t main()
{

    int t;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        vector<int> vt(n);
        for(int i=0;i<n;i++)
        {
            cin>>vt[i];

        }
        int x=vt[0];
        bool res=false;

        for(int i=1;i<n;i++)
        {
          if(vt[i]<x)
          {
              res=true;
          }
        }
        if(res)
        {
            cout<<"Alice"<<endl;
        }
        else
        {
            cout<<"Bob"<<endl;
        }

    }
}
