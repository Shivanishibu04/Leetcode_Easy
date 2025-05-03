int hammingWeight(int n) {
    int arr[100],p=0,rem,count=1;
    while(n>1){
        rem = n%2;
        arr[p++] = rem;
        n=n/2;       
    }
    for(int i=0;i<p;i++){
        if(arr[i] == 1){
            count++;
        }
    }
    return count;
}
