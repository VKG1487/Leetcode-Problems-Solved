class Solution:
    def getRow(self, rowIndex: int) -> list[int]:
        row = [1]
        val = 1
        for k in range(1, rowIndex + 1):
            val = val * (rowIndex - k + 1) // k
            row.append(val)
        return row