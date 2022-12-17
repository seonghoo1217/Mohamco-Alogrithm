function solution(data) {
  let input = data.toString().trim().split('\n');
  const count = input[0];
  const numbers = input[1].split(' ').map(Number);
  let result = 0;
  let check = [];

  for (i in numbers) {
    if (numbers[i] == 0) {
      result = -1;
    } else {
      check = numbers.filter(n => n == numbers[i]);
      if (check.length == numbers[i] && result < numbers[i]) {
        result = numbers[i];
      }
    }
  }
  return result;
}

const case1 = `4
0 1 2 3`;
const case2 = `1
0`;
const case3 = `6
0 3 1 3 2 3`;
const case4 = `2
1 1`;
console.log(solution(case1));
console.log(solution(case2));
console.log(solution(case3));
console.log(solution(case4));
