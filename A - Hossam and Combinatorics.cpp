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
        int Min=INT_MAX,Max=0;
        for(int i=0;i<n;i++)
        {
            cin>>vt[i];
            Min=min(Min,vt[i]);
            Max=max(Max,vt[i]);
        }
        int mincnt=0,maxcnt=0;
        for(int i=0;i<n;i++)
        {
            if(vt[i]==Min)
            {
                mincnt++;
            }
            if(vt[i]==Max)
            {
                maxcnt++;
            }
        }
        int ans;
        if(Min==Max)
        {
            ans=(mincnt*(mincnt-1));
        }
        else
        {
            ans=2*(maxcnt*(mincnt));
        }
       cout<<ans<<"\n";
    }
}
