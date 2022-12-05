//01:10:20
function isRight(str) {
  if (str == str.toString().split('').reverse().join('')) {
    return true;
  } else {
    return false;
  }
}
function solution(input) {
  let arr = input.split('\n');
  let result = [];
  let cnt = 0;
  let tmp = '';

  for (let i = 0; i < arr.length - 1; i++) {
    tmp = arr[i];
    if (isRight(arr[i])) {
      result[i] = 0;
    } else {
      while (!isRight(arr[i])) {
        cnt++;
        arr[i]++;
        while (tmp.length !== arr[i].toString().length) {
          arr[i] = '0' + arr[i];
        }
      }
      result[i] = cnt;
      cnt = 0;
    }
  }
  return result.join('\n');
}

const input = `100000
100001
000121
00456
0`;

console.log(solution(input));
