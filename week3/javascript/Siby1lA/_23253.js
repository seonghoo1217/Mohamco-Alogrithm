// 00:26:30
function solution(books) {
  const input = books.split("\n");
  const [_N, M] = input[0].split(" ");

  for (let i = 1; i <= M; i++) {
    let bookNumbers = input[i * 2].split(" ").map(Number);
    for (let j = 0; j < bookNumbers.length - 1; j++) {
      if (bookNumbers.pop() > bookNumbers.pop()) {
        return "NO";
      }
    }
  }
  return "YES";
}

const books = `4 2
2
3 1
2
4 2`;

console.log(solution(books));
