#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t,arr[3];
    int n=sizeof(arr)/sizeof(arr[0]);
    cin>>t;
    while(t-->0)
    {
        for(int i=0;i<n;i++)
        {
            cin>>arr[i];
        }
        sort(arr,arr+n);

          cout<<arr[1]<<"\n";
    }
    return 0;
}
