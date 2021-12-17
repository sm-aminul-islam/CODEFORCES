#include <iostream>
using namespace std;
int h,n,x,i,ans;

int main() {

    cin>>n>>h;
     ans=0;
    for(int i=1;i<=n;i++){
        cin>>x;
        if (x>h)
            ans++;
        ans++;

    }
    cout<<ans<<"\n"<<endl;

    return 0;
}
