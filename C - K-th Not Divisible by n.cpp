#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        long long n,k;
        cin>>n>>k;
        long long l=1,r=1e10,ans=1;
        while(l<=r)
        {
            long long mid=(l+r)/2;
            if(mid-(mid/n)==k && (mid%n)!=0)
            {
                ans=mid;
                break;
            }
            if(mid-(mid/n)>=k){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        cout<<ans;
        cout<<endl;
    }
}
