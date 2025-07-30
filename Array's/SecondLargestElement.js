let arr = [1,2,4,7,7,5]
arr.sort((a,b)=>{return a-b});

let largest = arr[arr.length-1]
let secondLargest;
for(let i = arr.length-2;i>=0;i--)
{
    if(arr[i]!=largest)
    {
        secondLargest = arr[i];
        break;
    }
}
console.log(secondLargest)