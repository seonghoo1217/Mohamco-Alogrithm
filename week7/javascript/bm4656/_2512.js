//00:31:24
function solution(data) {
  let [n, arr, m] = data.toString().trim().split('\n');

  arr = arr
    .split(' ')
    .map(Number)
    .sort((a, b) => a - b);
  // console.log(arr);
  let left = 0;
  let right = arr[arr.length - 1];
  let answer = 0;

  while (left <= right) {
    let mid = Math.floor((left + right) / 2);
    let isOk = 0;
    for (i of arr) {
      if (i > mid) isOk += mid;
      else isOk += i;
    }

    if (m >= isOk) {
      if (mid > answer) answer = mid;
      left = mid + 1;
    } else {
      right = mid - 1;
    }
  }
  return answer;
}

const case1 = `4
  120 110 140 150
  485`;

const case2 = `5
70 80 30 40 100
450`;
console.log(solution(case1));
console.log(solution(case2));
