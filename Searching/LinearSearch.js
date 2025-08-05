let arr = [6,7,8,9,1,2];
let target = 8;
function Searching(arr,target)
{
    for(let i = 0;i<arr.length;i++)
    {
        if(arr[i]==target)
        {
            return i;
        }
    }
    return -1;
}
let result = Searching(arr,target);
if(result == -1)
{
    console.log("Element not found in array's")
}
else
{
    console.log("Element found in array's")
}