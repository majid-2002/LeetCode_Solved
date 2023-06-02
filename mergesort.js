function mergeSort(arr) {
  if (arr.length < 2) {
    return arr;
  }

  const middleIndex = Math.floor(arr.length / 2); //? find the middle index of the array using Math.floor to round down to the nearest whole number
  const leftArr = arr.slice(0, middleIndex); //? slice the array from the 0 index to the middle index
  const rightArr = arr.slice(middleIndex); //? slice the array from the middle index to the end of the array

  return merge(mergeSort(leftArr), mergeSort(rightArr)); //? recursively call mergeSort on the left and right arrays and then call merge on the results
}

function merge(leftArr, rightArr) {
  let resultArr = [];
  let leftIndex = 0;
  let rightIndex = 0;

  while (leftIndex < leftArr.length && rightIndex < rightArr.length) {
    if (leftArr[leftIndex] < rightArr[rightIndex]) {
      resultArr.push(leftArr[leftIndex]);
      leftIndex++;
    } else {
      resultArr.push(rightArr[rightIndex]);
      rightIndex++;
    }
  }

  return resultArr
    .concat(leftArr.slice(leftIndex))
    .concat(rightArr.slice(rightIndex));
}

let arr = [12, 3, 16, 6, 5, 1];

console.log(mergeSort(arr));



//              [12, 3, 16, 6, 5, 1]
//                /               \
//      [12, 3, 16]            [6, 5, 1] // leftArr and rightArr
//       /      \                /    \
//    [12]    [3, 16]          [6]   [5, 1]
//           /   \                  /    \
//         [3]   [16]             [5]   [1] 
//          \     /                \     /
//          [3, 16]                [1, 5] // merge([5], [1]) = [1, 5] 
//              \                    /
//               [1, 3, 5, 6, 12, 16]

//? Time Complexity: O(n log n)