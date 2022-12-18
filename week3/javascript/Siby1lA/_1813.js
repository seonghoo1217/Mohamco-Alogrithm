// 00:30:21
function solution(blackBoard) {
  const input = blackBoard.split("\n");
  const N = parseInt(input[0]);

  if (!(50 >= N >= 1)) {
    return -1;
  }

  const contents = input[1]
    .split(" ")
    .map(Number)
    .sort((a, b) => b - a);

  for (let i = 0; i < N; i++) {
    let content = contents[i];

    if (!(0 <= content <= 50)) {
      return -1;
    }

    let count = 0;

    for (let j = 0; j < N; j++) {
      if (content === contents[j]) {
        count++;
      }
    }

    if (content === count) {
      return content;
    }
  }

  if (!contents.includes(0)) {
    return 0;
  }

  return -1;
}

const blackBoard = `2
1 1`;

console.log(solution(blackBoard));
