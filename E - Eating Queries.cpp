#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        long long n,q;
        cin>>n>>q;
        vector<long long> arr(n);
for(int i=0;i<n;i++)
{
    cin>>arr[i];
}
sort(arr.rbegin(),arr.rend());

 vector<int> prefx(n,0);

	prefx[0]=arr[0];
	for(int i=1;i<n;i++){
		prefx[i]=prefx[i-1]+arr[i];
	}
	


	while(q--){
		long long sum;
		cin>>sum;


		int low=0,high=n-1;
			int ans=-1;

		while(low<=high){
			int mid=low+(high-low)/2;
			if(prefx[mid]>=sum){
				ans=mid;
				high=mid-1;
			}
			else{
				low=mid+1;
			}
		}
		if(sum>prefx[n-1])
        {
            cout<<-1<<"\n";
        }
        else
        {
            cout<<ans+1<<"\n";
        }
    }


    }
}
