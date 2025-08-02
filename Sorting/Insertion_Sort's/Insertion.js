//Takes an element & place it in its current order.
function insertionSort(arr)
{
    let n = arr.length;
    for(let i = 0 ;i<=n-1;i++)
    {
        let j = i;
        while(j>0 && arr[j-1] > arr[j])
        {
            let temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j--;
        }
    }
    return arr;
}
let arr = [14,9,15,12,6,8,13];
console.log(insertionSort(arr));