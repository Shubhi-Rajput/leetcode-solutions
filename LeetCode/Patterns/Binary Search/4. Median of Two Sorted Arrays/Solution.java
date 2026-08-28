class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         int i,j=0,n,m,temp,total;
        double med=0.0;
        m=nums1.length;
        n=nums2.length;
        int arr[]=new int[m+n];
        for(i=0;i<m;i++)
        {
            arr[i]=nums1[i];
        }
        for(i=m;i<m+n;i++)
        {
            arr[i]=nums2[j++];
        }
        for(i=0;i<n+m-1;i++)
        {
            for(j=0;j<n+m-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
         }
         total=n+m;
         if(total%2!=0)
         return arr[total/2];
         else 
         return (arr[total/2]+arr[(total/2)-1])/2.0;
    }
}
/*        int m=nums1.length;
        int n=nums2.length;
        int []merged=new int[m+n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            merged[k++] = nums1[i];
        }
        for (int i = 0; i < m; i++) {
            merged[k++] = nums2[i];
        }

        // Sort the merged array.
        Arrays.sort(merged);

        // Calculate the total number of elements in the merged array.
        int total = merged.length;

        if (total % 2 == 1) {
            // If the total number of elements is odd, return the middle element as the median.
            return (double) merged[total / 2];
        } else {
            // If the total number of elements is even, calculate the average of the two middle elements as the median.
            int middle1 = merged[total / 2 - 1];
            int middle2 = merged[total / 2];
            return ((double) middle1 + (double) middle2) / 2.0;
        }
    }
}*/