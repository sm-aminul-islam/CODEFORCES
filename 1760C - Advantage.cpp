#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        vector<int> vt(n),ct(n);
        for(int i=0;i<n;i++)
        {
            cin>>vt[i];

        }
        if(n==1)
        {
            cout<<vt[0];
            continue;
        }
        ct=vt;
        sort(ct.begin(),ct.end());
        for(int i=0;i<n;i++)
        {

            if(vt[i]==ct[n-1])
            {
                cout<<vt[i]-ct[n-2]<<" ";

            }
            else{
                cout<<vt[i]-ct[n-1]<<" ";
            }
        }
        cout<<endl;



    }
    return 0;
}
