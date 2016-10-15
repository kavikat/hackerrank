#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    int size,sum,sums[size];
    scanf("%d", &size);
//adds array contents
    for(int i=0;i<=size;i++){
    	int val;
    	scanf("%d", &val);
    	sums[i] = val;
    }
    for(int i=1;i<=size;i++){
    	sum += sums[i];
    }
    printf("%d",sum);
    return 0;
}
